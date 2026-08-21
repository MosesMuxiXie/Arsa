/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public interface drw<T> {

    public static interface a<T>
    extends drw<T> {
        public T a(T var1, List<T> var2);
    }

    public static interface b<T>
    extends drw<T> {
        default public T a(jd<dlp> $$0) {
            return this.a(new dlt($$0));
        }

        default public T a(dlp $$0) {
            return this.a(new dlt($$0));
        }

        public T a(dlt var1);
    }
}

