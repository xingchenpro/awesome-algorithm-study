package com.hly.bloom;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.BitSet;

public class BloomFilter {
    private BitSet bitSet;
    private int bitSetSize;
    private int addedElements;
    private int hashFunctionNumber;

    /**
     * c 过滤器预定义开辟的空间
     * n 该过滤器最大包含记录
     * k 有多少个hash函数
     * 构造一个BloomFilter，过滤器的容量为c * k
     */
    public BloomFilter(int c, int n, int k) {
        this.hashFunctionNumber = k;
        this.bitSetSize = (int) Math.ceil(c * k);
        this.addedElements = n;
        this.bitSet = new BitSet(this.bitSetSize);
    }

    /**
     * 通过文件初始化过滤器.
     * @param file
     */
    public void init(String file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
//            int i = 0;
            while (line != null && line.length() > 0) {
                this.put(line);
                line = reader.readLine();
//                i++;
//                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String str) {
        int[] positions = createHashes(str.getBytes(), hashFunctionNumber);
        for (int i = 0; i < positions.length; i++) {
            int position = Math.abs(positions[i] % bitSetSize);
            bitSet.set(position, true);
        }
    }

    public boolean contains(String str) {
        byte[] bytes = str.getBytes();
        int[] positions = createHashes(bytes, hashFunctionNumber);
        for (int i : positions) {
            int position = Math.abs(i % bitSetSize);
            if (!bitSet.get(position)) {
                return false;
            }
        }
        return true;
    }


    /**
     * 得到当前过滤器的错误率.
     * @return
     */
    public double getFalsePositiveProbability() {
        // (1 - e^(-k * n / m)) ^ k
        return Math.pow((1 - Math.exp(-hashFunctionNumber * (double) addedElements / bitSetSize)),
                hashFunctionNumber);
    }
    /**
     * 将字符串的字节表示进行多哈希编码.
     * @param bytes 待添加进过滤器的字符串字节表示.
     * @param hashNumber 要经过的哈希个数.
     * @return 各个哈希的结果数组.
     */
    public static int[] createHashes(byte[] bytes, int hashNumber) {
        int[] result = new int[hashNumber];
        int k = 0;
        while (k < hashNumber) {
            result[k] = HashFunctions.hash(bytes, k);
            k++;
        }
        return result;
    }
}
