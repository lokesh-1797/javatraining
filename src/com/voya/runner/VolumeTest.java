package com.voya.runner;

import com.ha.volume.*;

public class VolumeTest {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Volume obj1 = new Volume();

		System.out.println("Volume of Cuboid : " + obj1.volumeOfCuboid(40, 20, 65.20));
		System.out.println("Volume of Sphere : " + obj1.volumeOfSphere(55.5));
		System.out.println("Volume of Cylinder : " + obj1.volumeOfCylinder(3, 100));
		System.out.println("Volume of Cone : " + obj1.volumeOfCone(1.5, 85.20));

	}

}