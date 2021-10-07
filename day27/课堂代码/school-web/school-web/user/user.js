window.onload = function() {
	//一开始设置一页有几条
	var number = 5;

	function selectUser() {
		//获取页数
		ajax("http://localhost:8080/user/userCounts", "", function(result) {
			//用总条数 / 一页有几条
			// 11 /5 向上取整 3
			var page = Math.ceil(result / number);
			var pages = document.getElementById("pages");
			for (var i = 1; i <= page; i++) {
				var button = document.createElement("button");
				button.innerText = "第" + i + "页";
				pages.appendChild(button);
				button.setAttribute("id", i);
				button.onclick = function() {
					console.log(this.getAttribute("id"));
					getUser(this.getAttribute("id"));
				}
			}
		});
		getUser(1);
	}
	//查询数据
	selectUser();

	function getUser(page) {
		//1 *5 -5=0
		var start = page * number - number;
		ajax("http://localhost:8080/user/userList", "start=" + start + "&limit=" + number, function(result) {
			var obj = JSON.parse(result);
			var tbody = document.getElementById("tbody");
			tbody.innerHTML = "";
			for (var i in obj) {
				var id = obj[i].id;
				var userName = obj[i].userName;
				var passWord = obj[i].passWord;
				var sex = obj[i].sex;
				var email = obj[i].email;
				var detail = obj[i].detail;
				var skill = obj[i].skill;
				var tel = obj[i].tel;
				var tr = document.createElement("tr");
				tr.setAttribute("id", "tr" + id);
				var td =
					`
								<td>${id}</td>
								<td>${userName}</td>
								<td>${passWord}</td>
								<td>${sex}</td>
								<td>${email}</td>
								<td>${detail}</td>
								<td>${skill}</td>
								<td>${tel}</td>
							`;
				tr.innerHTML = td;
				tbody.appendChild(tr);
				//创建删除按钮
				var deleteButton = document.createElement("button");
				deleteButton.innerText = "删除";
				deleteButton.setAttribute("userId", id);
				deleteButton.onclick = function() {
					var result = confirm("是否确认删除");
					if (result == true) {
						var id = this.getAttribute("userId");
						ajax("http://localhost:8080/user/userDelete", "id=" + id, function() {
							document.getElementById("tr" + id).remove();
						})
					}
				}
				//把删除按钮放到td
				var td = document.createElement("td");
				td.appendChild(deleteButton);
				//把td放到tr
				tr.appendChild(td);
			}
		});
	}


	function ajax(url, sendParam, callBack) {
		var xhr = new XMLHttpRequest();
		xhr.open("POST", url, true);
		//POST提交时需添加请求头“Content-Type”，指定MIME类型
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
		xhr.onreadystatechange = function() {
			// readyState == 4说明请求已完成
			if (xhr.readyState == 4) {
				if (xhr.status == 200) {
					var result = xhr.responseText;
					callBack(result);
				}
			}
		}
		xhr.send(sendParam);
	}
}
