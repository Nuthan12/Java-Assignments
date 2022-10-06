package com.valtech.training.corejava.day1;

public class PointD extends Point implements Comparable<Point>{
	private int z;
	public static final PointD ORIGIN = new PointD(0,0,0);
	public PointD() {}
	public PointD(int x,int y,int z) {
		super(x,y);
		
		this.z=z;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof PointD) {
			PointD P=(PointD) obj;
			return P.x==x && P.y==y && P.z==z;
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return toString().hashCode();
	}
	@Override
	public String toString() {
		
		return new StringBuffer("X = ").append(x).append(" Y = ").append(y).append(" Z = ").append(z).toString();
	}
	
	@Override
	public double distance() {
		System.out.println("Distance of 3 Dimensions");
		return Math.sqrt((x*x)+(y*y)+(z*z));
	}
	
	public double distance(int x,int y,int z) {
		int dx=this.x-x;
		int dy=this.y-y;
		int dz=this.z-z;
		System.out.println("iam done");
		return Math.sqrt((dx*dx)+(dy*dy)+(dz*dz));
	}
	
	public double distance(PointD p) {
		return distance(p.x,p.y,p.z);
	}

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public int compareTo(Point o) {
		
		if(distance()<o.distance()) {
			return -1;
		}
		if(distance()==o.distance()) {
			if(x<o.x) {
				return -1;
			}
			if(x>o.x) {
				return +1;
			}
			
			return 0;
		}
		return 1;
		
	}
	public static void main(String[] args) {
		Point n=new PointD(10,20,30);
		System.out.println(n.distance());
//		PointD n1=(PointD)new Point(10,20);
//		PointD n2=(PointD)n;
	}
	}	
	
	
