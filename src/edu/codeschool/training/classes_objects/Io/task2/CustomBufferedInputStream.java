package edu.codeschool.training.classes_objects.Io.task2;

import java.io.IOException;
import java.io.InputStream;

public  class CustomBufferedInputStream extends InputStream {
    private static final int DEFAULT_BUFF_SIZE = 8172;

    private InputStream source;
    private byte[] buffer;
    private static int position = 0;
    private int readCount = 0;

    public CustomBufferedInputStream(InputStream source) {
        this.buffer = new byte[DEFAULT_BUFF_SIZE];
        this.source = source;
    }

    public CustomBufferedInputStream(InputStream source, int size) {
        this.buffer = new byte[size];
        this.source = source;
    }

    @Override
    public int read() throws IOException {

        if (position == 0 || position == readCount) {
            readCount = source.read(buffer);
            position = 0;
        }
        if (readCount != -1 && position < readCount) {
            return buffer[position++];
        }else {
            return -1;
        }
    }
}