// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
import VueAxios from 'vue-axios'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.use(VueAxios, axios)
Vue.use(ElementUI)
Vue.config.productionTip = false

/**
 * @param {Object} url 		请求地址
 * @param {Object} param	请求参数
 * @param {Object} callBack	回调函数
 */
Vue.prototype.postAjax = function (url,param,callBack){//changeData是函数名
  	var qs = require('qs');
  	param = qs.stringify(param);
  	this.axios.post(url,param)
	.then((response) => {
		callBack(response)
	})
}

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
