package javatest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		demo.setAge(20);
		demo.setCountry("Chain");
		demo.setID(1L);
		demo.setName("Ronin");
		demo.getCourses().add("java");
		
		//序列化
		byte[] byteArray = serialize(demo);
		
		System.out.println(Arrays.toString(byteArray));
		
		//反序列化
		Demo demo_2 = deserialize(byteArray);
		
		System.out.println(demo_2.getAge());
		System.out.println(demo_2.getID());
		System.out.println(demo_2.getName());
		System.out.println(demo_2.getCountry());
		System.out.println(demo_2.getCourses());
	}
	
	//序列化
	private static byte[] serialize(Demo demo) throws Exception {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		oos.writeObject(demo);
		
		return out.toByteArray();
		
	}
	
	//反序列化
	private static Demo deserialize(byte[] byteArray) throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArray));
		Demo demo = (Demo) ois.readObject();
		return demo;
		
	}

}
