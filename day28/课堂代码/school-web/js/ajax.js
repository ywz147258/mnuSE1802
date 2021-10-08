function ajax(url, sendParam, callBack) {
		var xhr = new XMLHttpRequest();
		xhr.open("POST", "http://localhost:8088"+url, true);
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