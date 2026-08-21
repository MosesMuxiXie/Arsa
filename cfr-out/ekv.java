/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public interface ekv {
    public List<a> a();

    public static class a {
        private final int a;
        private int b;

        public a(int $$0) {
            this.a = $$0;
            this.b = 1;
        }

        public void a() {
            ++this.b;
        }

        public int b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }
    }
}

