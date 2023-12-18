
package boletin09_3;

public class AreaRectangulo {
    float base;
    float altura;
    
    public void verArea(float base, float altura){
    
    if(base>0 && altura>0){
        System.out.println("área= " +(base*altura));
        
    }else{
        System.out.println("error");
    }
    }
}
