
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

/* ��ȡstore */
let store=all.createState(reducer,initState)
/* ����һ������ */
store.substrib(()=>{
    let state=store.getState();
    // console.log(state)
     //console.log(state.counter.count+state.info.name+state.info.description)
});
/* ��һ������ */
store.dispath({
    type:'INCRE'
});
// /* �ڶ������� */
// store.dispath({
//     type:'SETNAME',
//     name:"jerry"
// });


