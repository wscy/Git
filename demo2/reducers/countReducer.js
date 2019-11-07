let initState = {
    count: 0
  }
function countReducer(state,action){
      /*如果 state 还没有值，那就给他初始值*/
  if (!state) {
    state = initState;
  }
    switch(action.type){
        case 'INCRE':
            return{
                ...state,
            count:state.count+1
            }
            case 'DESC':
            return{
                ...state,
            count:state.count-1
            }
    }
}
module.exports = {countReducer}