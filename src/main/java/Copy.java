import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by barriosj on 2/1/17.
 */
public class Copy {
    public static void main(final String args[]) throws Exception {
        FileInputStream is = new FileInputStream(args[0]);

        ClassReader cr = new ClassReader(is);
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cr.accept(cw,0);

        FileOutputStream fos = new FileOutputStream(args[1]);
        fos.write(cw.toByteArray());
        fos.close();
    }
}
