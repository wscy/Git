
    /* �ƶ�һ���޸ļƻ� */
    function reducer(state,action){
        switch(action.type){
            case 'INCRE':
                return{
                    ...state,
                    count:state.count+1
                }
            case 'DES':
            return{
                ...state,
                count:state.count-1
            }

        }
    }
    module.exports = {reducer}