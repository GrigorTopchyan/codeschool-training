package edu.codeschool.training.files;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class CustomBufferedInputStream extends InputStream implements Closeable {
    InputStream inputStream;
    int size;
    private byte [] buffer;
    int count;




    public CustomBufferedInputStream(InputStream inputStream, int size) {
        this.inputStream = inputStream;
        this.size = size;
    }

    public CustomBufferedInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public int read(byte[] b) throws IOException {
        return super.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }

    @Override
    public void close() throws IOException {

    }
}
