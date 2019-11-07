
let initState={
    name:"TOM",
    des:"19 years old"
}
function infoReducer(state,action){
    if (!state) {
        state = initState;
      }
    switch(action.type){
        case 'SETNAME':
            return{
                ...state,
            name:action.name
            }
            case 'SETDES':
            return{
                ...state,
            count:action.des
            }
            default :
            return state
    }
}
module.exports = {infoReducer}