const base = {
    get() {
        return {
            url : "http://localhost:8080/huaijiuchangpianshoumai/",
            name: "huaijiuchangpianshoumai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/huaijiuchangpianshoumai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "怀旧唱片售卖系统"
        } 
    }
}
export default base
