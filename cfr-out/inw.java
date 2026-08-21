/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface inw {
    public iof a(amo var1);

    public hqg a();

    public iog b();

    public a c();

    public <T> T a(b<T> var1);

    public static interface a {
        default public Vector3fc a(float $$0, float $$1, float $$2) {
            return this.a((Vector3fc)new Vector3f($$0, $$1, $$2));
        }

        public Vector3fc a(Vector3fc var1);
    }

    @FunctionalInterface
    public static interface b<T> {
        public T compute(inw var1);
    }
}

