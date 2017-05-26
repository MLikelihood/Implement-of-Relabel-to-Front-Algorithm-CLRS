package relabelToFront;

public class Test {
public  static void main(String args[]){
	int[][] caps=new int[5][5];
	caps[0][1]=5;
	caps[0][2]=4;
	caps[1][2]=1;
	caps[1][3]=3;
	caps[2][3]=4;
	caps[2][4]=5;
	caps[3][4]=2;
	FlowNetwork fn=new FlowNetwork(5,0,4,caps);
	RelabelTFront r=new RelabelTFront(fn);
	System.out.println(r.getMaxFlow());
	System.out.format("s,a,%d", r.getFlows()[0][1]);
	System.out.println();
	System.out.format("s,b,%d", r.getFlows()[0][2]);
	System.out.println();
	System.out.format("a,b,%d", r.getFlows()[1][2]);
	System.out.println();
	System.out.format("a,c,%d", r.getFlows()[1][3]);
	System.out.println();
	System.out.format("b,c,%d", r.getFlows()[2][3]);
	System.out.println();
	System.out.format("c,t,%d", r.getFlows()[3][4]);
	
}
}
