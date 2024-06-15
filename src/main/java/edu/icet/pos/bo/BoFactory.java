package edu.icet.pos.bo;

import edu.icet.pos.util.BoType;

public class BoFactory {
    private static BoFactory instance;
    private BoFactory(){}

    public static BoFactory getInstance() {
        return instance != null ? instance:(instance=new BoFactory());
    }

//    public <T extends SuperBo>T getBo(BoType type){
//        switch (type){
//            case USER:
//                return (T) new UserBo();
//            case ORDER:
//                return (T) new OrderBo();
//        }
//    }
}
