import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import VB from '@/components/AvalueBind'
import IF from '@/components/IF'
import FOR from '@/components/FOR'
import EVENT from '@/components/EVENT'
import COMPUTED from '@/components/computed'
import WATCH from '@/components/watch'

Vue.use(Router)

export default new Router({
	routes: [{
			path: '/',
			name: 'HelloWorld',
			component: HelloWorld
		},
		{
			path: '/vb',
			name: 'vb',
			component: VB
		},
		{
			path: '/if',
			name: 'if',
			component: IF
		},
		{
			path: '/for',
			name: 'for',
			component: FOR
		},
		{
			path: '/event',
			name: 'event',
			component: EVENT
		},
		{
			path: '/computed',
			name: 'computed',
			component: COMPUTED
		},
		{
			path: '/watch',
			name: 'watch',
			component: WATCH
		}
	]
})
