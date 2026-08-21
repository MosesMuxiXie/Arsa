/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Path;
import java.util.List;

public interface bzk {
    public static final char d = '\u001e';

    public List<bzo> a(String var1);

    public boolean a(Path var1);

    public long a();

    public int b();

    public long c();

    public int d();

    default public long g() {
        return this.c() - this.a();
    }

    default public int f() {
        return this.d() - this.b();
    }

    public String e();

    public static String b(String $$0) {
        return $$0.replace('\u001e', '.');
    }
}

