
const all=require("./redux")


let initState={
   count:0
}
/* 获取store */
let store=all.createState(initState)
/* 连接一个订阅 */
store.substrib(()=>{
    let state=store.getState();
    console.log(state.count+"==============")
});
/* 第一个订阅 */
store.dispath({
    type:'INCRE'
});
/* 第二个订阅 */
store.dispath({
    type:'DES'
});


