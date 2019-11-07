 function combineReducers(reducers) {

    /* reducerKeys = ['counter', 'info']*/
    const reducerKeys = Object.keys(reducers)
  
    /*���غϲ�����µ�reducer����*/
    return function combination(state = {}, action) {
      /*���ɵ��µ�state*/
      const nextState = {}
  
      /*����ִ�����е�reducers�����ϳ�Ϊһ���µ�state*/
      for (let i = 0; i < reducerKeys.length; i++) {
        const key = reducerKeys[i]
        const reducer = reducers[key]
        /*֮ǰ�� key �� state*/
        const previousStateForKey = state[key]
        /*ִ�� �� reducer������µ�state*/
        const nextStateForKey = reducer(previousStateForKey, action)
  
        nextState[key] = nextStateForKey
      }
      return nextState;
    }
  }
  module.exports = {combineReducers}