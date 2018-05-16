package org.io.readWritePrimitives;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStreamTest {

	public static void main(String[] args) {

		writePrimitives();
		readPrimitives();
	}

	private static void readPrimitives() {

		try (DataInputStream os = new DataInputStream(new FileInputStream(new File("primitives.dat")))) {

			System.out.println(os.readByte());
			System.out.println(os.readShort());
			System.out.println(os.readChar());
			System.out.println(os.readInt());
			System.out.println(os.readFloat());
			System.out.println(os.readDouble());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void writePrimitives() {
		try (DataOutputStream os = new DataOutputStream(new FileOutputStream(new File("primitives.dat")))) {

			os.writeByte(7);
			os.writeShort(45);
			os.writeChar(97);
			os.writeInt(new Integer(10));
			os.writeFloat(11.5f);
			os.writeDouble(1.5);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
