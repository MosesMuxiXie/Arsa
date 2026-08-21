/*
 * Decompiled with CFR 0.152.
 */
@FunctionalInterface
public interface ea {
    public static final ea a = new ea(){

        @Override
        public void onResult(boolean $$0, int $$1) {
        }

        public String toString() {
            return "<empty>";
        }
    };

    public void onResult(boolean var1, int var2);

    default public void onSuccess(int $$0) {
        this.onResult(true, $$0);
    }

    default public void onFailure() {
        this.onResult(false, 0);
    }

    public static ea chain(ea $$0, ea $$1) {
        if ($$0 == a) {
            return $$1;
        }
        if ($$1 == a) {
            return $$0;
        }
        return ($$2, $$3) -> {
            $$0.onResult($$2, $$3);
            $$1.onResult($$2, $$3);
        };
    }
}

