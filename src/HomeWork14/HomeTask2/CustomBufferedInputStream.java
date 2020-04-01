package HomeWork14.HomeTask2;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CustomBufferedInputStream extends InputStream {
    private  static  final  int DEFAULT_SIZE= 8172;
    InputStream source = null;
    private  byte[] buffer;
    public static int count = 0;
    public int readCount = 0;

    public CustomBufferedInputStream(InputStream source) {
        this.source = source;
        this.buffer = new byte[DEFAULT_SIZE];
    }

    public CustomBufferedInputStream(InputStream source, int size) {
        this.source = source;
        this.buffer = new byte[size];
    }

    @Override
    public int read() throws IOException {
        if (readCount==0){
            readCount=source.read(buffer);
        } if(readCount !=0 && count<=readCount){
        return buffer[count++];}
        else {return -1;}
    }
}
