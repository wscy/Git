function createState(initState){
    let state=initState
    let listeners=[]
    
    let redu=require('./reducer')
    function substrib(listener){
        listeners.push(listener)
    }
    function dispath(action){
        state=redu.reducer(state,action)
        for(let i=0;i<listeners.length;i++){
            let listener=listeners[i];
            listener();
        }
    }

    function getState(){
        return state
    }
    
    return{
        substrib,
        getState,
        dispath
    }
}

module.exports = {createState}