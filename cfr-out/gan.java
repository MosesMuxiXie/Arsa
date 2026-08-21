/*
 * Decompiled with CFR 0.152.
 */
public interface gan {
    public gad b();

    public void d();

    public static gan f() {
        return new gan(){
            private final gad a = new gad();

            @Override
            public gad b() {
                return this.a;
            }

            @Override
            public void d() {
            }
        };
    }
}

