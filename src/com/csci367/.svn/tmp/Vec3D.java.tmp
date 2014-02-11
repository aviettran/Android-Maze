/**
 * A Vec3D can store any of: points, vectors and normals. It is the programmer's
 * job to keep them straight. The particularly tricky cases, such as
 * transforming normals and vectors, shouldn't come up in this project.
 * 
 * Operator overloading sure would have been nice... Silly Java.
 */

package com.csci367;

public class Vec3D {
	/**
	 * Constructor: Create a new object with the separate three parameters
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	Vec3D(double x, double y, double z) {
		X = x;
		Y = y;
		Z = z;
	}

	/**
	 * The subtraction of two vectors
	 * @param A
	 * @param B
	 * @return A-B
	 */
	static Vec3D sub(Vec3D A, Vec3D B) {
		return new Vec3D(A.X-B.X, A.Y-B.Y, A.Z-B.Z);
	}
	Vec3D sub(Vec3D rhs) {
		return sub(this,rhs);
	}	
	/**
	 * The addition of two vectors
	 * @param A
	 * @param B
	 * @return A-B
	 */
	static Vec3D add(Vec3D A, Vec3D B) {
		return new Vec3D(A.X+B.X, A.Y+B.Y, A.Z+B.Z);
	}
	
	Vec3D add(Vec3D rhs) {
		return add(this,rhs);
	}
	
	/**
	 * The dot product of two vectors is returned
	 * @param A
	 * @param B
	 * @return dot(A,B)
	 */
	static double dot(Vec3D A, Vec3D B) {
		return A.X*B.X + A.Y*B.Y + A.Z*B.Z;
	}
	
	/**
	 * Reurn a new Vec3D that is the corss of A and B
	 * @param A
	 * @param B
	 * @return AxB
	 */
	static Vec3D cross(Vec3D A, Vec3D B) {
		return new Vec3D(A.Y*B.Z-A.Z*B.Y, -(A.X*B.Z-A.Z*B.X), A.X*B.Y-A.Y*B.X);
	}
	
	Vec3D mult(double scaler) {
		return new Vec3D(scaler*X, scaler*Y, scaler*Z);
	}
	
	Vec3D normalize() {
		double norm = Math.sqrt(X*X+Y*Y+Z*Z);
		return new Vec3D(X/norm, Y/norm, Z/norm);
	}

	/* Allow for clean printing and debugging
	 * @see java.lang.Object#toString()
	 */
	
	double length() {
		return Math.sqrt(X*X+Y*Y+Z*Z);
	}
	
	public String toString() {
		return new String("[" + X + ", " + Y + ", " + Z + "]");
	}

	public double X, Y, Z;
	
	public static void main(String[] args){

		System.out.println("A: [1,2,3]");
		Vec3D A = new Vec3D(1,2,3);
		
		System.out.println("B: [4,5,6]");
		Vec3D B = new Vec3D(4,5,6);

		System.out.println("cross(A,B):");
		System.out.println(cross(A, B));
		System.out.println("dot(A,B):");
		System.out.println(dot(A, B));
		System.out.println("normalize(A):");
		System.out.println(A.normalize());
	}
}
