
const all=require("./redux/redux");
const countReducers=require("./reducers/countReducer");
const infoReducers=require("./reducers/infoReducer");
const combine=require("./redux/combineReducer");

const reducer=combine.combineReducers({
    count:countReducers.countReducer,
    info:infoReducers.infoReducer
})

let initState={
    counter: {
        count: 0
      },
      info: {
        name: 'tom',
        description: '19 years old'
      }
}

/* 获取store */
let store=all.createState(reducer,initState)
/* 连接一个订阅 */
store.substrib(()=>{
    let state=store.getState();
    // console.log(state)
     //console.log(state.counter.count+state.info.name+state.info.description)
});
/* 第一个订阅 */
store.dispath({
    type:'INCRE'
});
// /* 第二个订阅 */
// store.dispath({
//     type:'SETNAME',
//     name:"jerry"
// });


