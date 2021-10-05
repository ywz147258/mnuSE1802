	function submit(){
				//获取输入框的内容
				var text= document.getElementById("text");
				//dg
				//赋值聊天框
				var talkBox= document.getElementById("talkBox");
				talkBox.value+=text.value;
				//加一个换行
				talkBox.value+="\n";
				//把输入框清空
				text.value="";
			}