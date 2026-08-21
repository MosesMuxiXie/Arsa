/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class git
extends Enum<git> {
    public static final /* enum */ git a = new git(){

        @Override
        public int a(int $$0, int $$1) {
            return $$0;
        }

        @Override
        public int a(int $$0, gio $$1, bfr $$2) {
            return $$0;
        }
    };
    public static final /* enum */ git b = new git(){

        @Override
        public int a(int $$0, int $$1) {
            return $$0 - $$1 / 2;
        }
    };
    public static final /* enum */ git c = new git(){

        @Override
        public int a(int $$0, int $$1) {
            return $$0 - $$1;
        }
    };
    private static final /* synthetic */ git[] d;

    public static git[] values() {
        return (git[])d.clone();
    }

    public static git valueOf(String $$0) {
        return Enum.valueOf(git.class, $$0);
    }

    public abstract int a(int var1, int var2);

    public int a(int $$0, gio $$1, bfr $$2) {
        return this.a($$0, $$1.a($$2));
    }

    private static /* synthetic */ git[] a() {
        return new git[]{a, b, c};
    }

    static {
        d = git.a();
    }
}

