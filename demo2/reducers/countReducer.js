let initState = {
    count: 0
  }
function countReducer(state,action){
      /*��� state ��û��ֵ���Ǿ͸�����ʼֵ*/
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