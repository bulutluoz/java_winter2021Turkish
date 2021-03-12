package day23_statickeyword;

public class MyConstructor {
    
	    int x =3;
	    int y =5;
	    
	    MyConstructor () {
	        x+=1;
	        System.out.println("-x"+x);       
	    }
	    
	    MyConstructor (int i) {
	        this();
	        
	        this.y=i;
	        x+=y;
	        System.out.println("-x"+x);
	        }
	    
	    MyConstructor (int i, int i2) {
	        this(3);
	        
	        this.x-=4;
	        System.out.println("-x"+x);
	    }
	    @SuppressWarnings("unused")
		public static void main(String[] args) {
	        MyConstructor mc1 = new MyConstructor (4,3);
	    }
	}
	