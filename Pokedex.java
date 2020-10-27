import java.util.*;
class Pokedex{

    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);
        String nmbre1,nmbre2,nmbre3;
        int idCh=0,idBl=0,idSq=0,
        f1=0,f2=0,f3=0,d1=0,d2=0,d3=0,v1=0,v2=0,v3=0,
        atc1=0,atc2=0,atc3=0,atc12=0,atc22=0,atc32=0;
        //Registro:
        System.out.println("3IV9 Coronado Segundo Juan Yael");
        
        System.out.println("Bienvenido al programa pokedex");
        System.out.println("Iniciando registro");
        System.out.println("El registro sera en este orden");
        System.out.println("1.-Charmander");
        System.out.println("2.-Bulbasaur");
        System.out.println("3.-Squartle");
        
    for(int i=0;i<3; i++) {
        System.out.println("Ingrese su id");
        if(idCh==0){
        idCh = leer.nextInt();
        System.out.println("Ingrese su fuerza");
        try {
            f1 = leer.nextInt();
            } catch (Exception e) {
            System.out.println("Ingresa un numero entero positivo");
            }
        System.out.println("Ingrese su defensa");
        d1 = leer.nextInt();
        System.out.println("Ingrese su ataque principal");
        atc1 = leer.nextInt();
        System.out.println("Ingrese su ataque secundario");
        atc12 = leer.nextInt();
        }else{
        if(idBl==0){   
        idBl = leer.nextInt();
        System.out.println("Ingrese su fuerza");
        try {
            f2 = leer.nextInt();
            } catch (Exception e) {
            System.out.println("Ingresa un numero entero positivo");
            }
        System.out.println("Ingrese su defensa");
        d2 = leer.nextInt();
        System.out.println("Ingrese su ataque principal");
        atc2 = leer.nextInt();
        System.out.println("Ingrese su ataque secundario");
        atc22 = leer.nextInt();
        }else {
        idSq = leer.nextInt();
        System.out.println("Ingrese su fuerza");
        try {
            f3 = leer.nextInt();
            } catch (Exception e) {
            System.out.println("Ingresa un numero entero positivo");
            }
        System.out.println("Ingrese su defensa");
        d3 = leer.nextInt();
        System.out.println("Ingrese su ataque principal");
        atc3 = leer.nextInt();
        System.out.println("Ingrese su ataque secundario");
        atc32 = leer.nextInt();
        }
        }
    }
    System.out.println("Los datos fueron registrados");
    System.out.println("Accediendo al menu principal");
    System.out.println();
    System.out.println();
    System.out.println("---------------------");
    System.out.println("Seleccione una opcion");
    System.out.println("---------------------");
    System.out.println("1.-Consultar datos de charmander");
    System.out.println("2.-Consultar datos de bulbasaur");
    System.out.println("3.-Consultar datos de squartle");
    System.out.println("4.-Batalla pokemon");
    System.out.println("5.-Apagar pokedex");
        
        
    
    int opcion1 = leer.nextInt();
    switch(opcion1){
        case 1:
        System.out.println("Mostrando datos de charmander");
        System.out.println("Id: "+idCh);
        System.out.println("Fuerza: "+f1);
        System.out.println("Defensa: "+d1);
        System.out.println("Vida: 10");
        System.out.println("Ataque principal: "+atc1);
        System.out.println("Ataque secundario: "+atc12);
                            
        break; 
                
        case 2:
        System.out.println("Mostrando datos de charmander");
        System.out.println("Id: "+idBl);
        System.out.println("Fuerza: "+f2);
        System.out.println("Defensa: "+d2);
        System.out.println("Vida: 10");
        System.out.println("Ataque principal: "+atc2);
        System.out.println("Ataque secundario: "+atc22);
        break;
 
        case 3:
        System.out.println("Mostrando datos de charmander");
        System.out.println("Id: "+idSq);
        System.out.println("Fuerza: "+f3);
        System.out.println("Defensa: "+d3);
        System.out.println("Vida: 10");
        System.out.println("Ataque principal: "+atc3);
        System.out.println("Ataque secundario: "+atc32);    
        break;
            
        case 4:
        System.out.println("Sera una batalla contra charmander");
        System.out.println("Fuerza: "+f3);
        System.out.println("Defensa: "+d3);
        int impacto = f3+d3/3;
        break;    
              
        default :
        System.exit(0);
                
    }        

}             
    
}