/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Predicate;

public interface eqw<T> {
    public int a(T var1, eqx<T> var2);

    public boolean a(Predicate<T> var1);

    public T a(int var1);

    public void a(wx var1, ji<T> var2);

    public void b(wx var1, ji<T> var2);

    public int a(ji<T> var1);

    public int a();

    public eqw<T> b();

    public static interface a {
        public <A> eqw<A> create(int var1, List<A> var2);
    }
}

