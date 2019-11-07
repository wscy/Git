function createState(reducer,initState){
    let state=initState
    let listeners=[]
    
    function substrib(listener){
        listeners.push(listener)
    }
    function dispath(action){
        state=reducer(state,action)
        for(let i=0;i<listeners.length;i++){
            let listener=listeners[i];
            listener();
        }
    }

    function getState(){
        return state
    }
    console.log("======="+state.counter.count+"===="+state.info.name+"---");
    return{
        substrib,
        getState,
        dispath
    }
    
}

module.exports = {createState}