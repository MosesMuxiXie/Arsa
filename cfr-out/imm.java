/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

public class imm {
    @Deprecated
    public static int[] a(baz $$0, amo $$1) throws IOException {
        try (InputStream $$2 = $$0.open($$1);){
            fyh $$3 = fyh.a($$2);
            try {
                int[] nArray = $$3.f();
                if ($$3 != null) {
                    $$3.close();
                }
                return nArray;
            }
            catch (Throwable throwable) {
                if ($$3 != null) {
                    try {
                        $$3.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
    }
}

