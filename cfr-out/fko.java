/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface fko
extends fkt {
    public @Nullable eql a(jw var1);

    public int b(is var1);

    public static final class a
    extends Enum<a>
    implements fko {
        public static final /* enum */ a a = new a();
        private static final /* synthetic */ a[] b;

        public static a[] values() {
            return (a[])b.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        @Override
        public @Nullable eql a(jw $$0) {
            return null;
        }

        @Override
        public int b(is $$0) {
            return 0;
        }

        @Override
        public void a(is $$0) {
        }

        @Override
        public boolean M_() {
            return false;
        }

        @Override
        public int a() {
            return 0;
        }

        @Override
        public void a(jw $$0, boolean $$1) {
        }

        @Override
        public void a(dvu $$0, boolean $$1) {
        }

        @Override
        public void b(dvu $$0) {
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a};
        }

        static {
            b = fko$a.c();
        }
    }
}

