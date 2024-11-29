package com.github.git_leon.utils.collections.arrays;

import com.github.git_leon.utils.collections.Streams;

import java.util.Arrays;

public class ArrayUtils {
    public static String toString(Object... objectArray) {
        objectArray = Streams.flatten(objectArray).toArray();
        if (objectArray.length == 1) {
            return objectArray[0].toString();
        }
        return Arrays.toString(objectArray);
    }

    public static boolean isArray(Object obj) {
        return (obj != null
                && obj.getClass().isArray()
                && obj.getClass().getComponentType() != null);
    }

    public static <T> Object[] toNonPrimitiveArray(T obj) {
        Object[] result = null;
        Class<?> componentType = obj.getClass().getComponentType();
        switch (componentType.getSimpleName()) {
            case "byte":
                result = toByteArray(((byte[]) obj));
                break;

            case "short":
                result = toShortArray((short[]) obj);
                break;

            case "int":
                result = toIntegerArray((int[]) obj);
                break;

            case "long":
                result = toLongArray((long[]) obj);
                break;

            case "float":
                result = toFloatArray((float[]) obj);
                break;

            case "double":
                result = toDoubleArray((double[]) obj);
                break;

            case "char":
                result = toCharacterArray((char[]) obj);
                break;

            default:
                result = (Object[]) obj;
        }

        return result;
    }


    private static Character[] toCharacterArray(char[] obj) {
        Character[] array = new Character[obj.length];
        for (int i = 0; i < obj.length; i++) {
            array[i] = obj[i];
        }
        return array;
    }

    private static Double[] toDoubleArray(double[] obj) {
        Double[] array = new Double[obj.length];
        for (int i = 0; i < obj.length; i++) {
            array[i] = obj[i];
        }
        return array;
    }


    private static Float[] toFloatArray(float[] obj) {
        Float[] array = new Float[obj.length];
        for (int i = 0; i < obj.length; i++) {
            array[i] = obj[i];
        }
        return array;
    }

    private static Long[] toLongArray(long[] obj) {
        Long[] array = new Long[obj.length];
        for (int i = 0; i < obj.length; i++) {
            array[i] = obj[i];
        }
        return array;
    }

    private static Integer[] toIntegerArray(int[] obj) {
        Integer[] array = new Integer[obj.length];
        for (int i = 0; i < obj.length; i++) {
            array[i] = obj[i];
        }
        return array;
    }

    private static Short[] toShortArray(short[] obj) {
        Short[] array = new Short[obj.length];
        for (int i = 0; i < obj.length; i++) {
            array[i] = obj[i];
        }
        return array;
    }

    private static Byte[] toByteArray(byte[] obj) {
        Byte[] array = new Byte[obj.length];
        for (int i = 0; i < obj.length; i++) {
            array[i] = obj[i];
        }
        return array;
    }
}
