/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  it.unimi.dsi.fastutil.chars.CharList
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.chars.CharList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface byz {
    public static byo<StringReader> a(String $$0) {
        return new b($$0);
    }

    public static byo<StringReader> a(final char $$0) {
        return new a(CharList.of((char)$$0)){

            @Override
            protected boolean a(char $$02) {
                return $$0 == $$02;
            }
        };
    }

    public static byo<StringReader> a(final char $$0, final char $$1) {
        return new a(CharList.of((char)$$0, (char)$$1)){

            @Override
            protected boolean a(char $$02) {
                return $$02 == $$0 || $$02 == $$1;
            }
        };
    }

    public static StringReader a(String $$0, int $$1) {
        StringReader $$2 = new StringReader($$0);
        $$2.setCursor($$1);
        return $$2;
    }

    public static final class b
    implements byo<StringReader> {
        private final String a;
        private final byf<CommandSyntaxException> b;
        private final byn<StringReader> c;

        public b(String $$0) {
            this.a = $$0;
            this.b = byf.a(CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect(), $$0);
            this.c = $$1 -> Stream.of($$0);
        }

        @Override
        public boolean a(byk<StringReader> $$0, bym $$1, bye $$2) {
            $$0.f().skipWhitespace();
            int $$3 = $$0.g();
            String $$4 = $$0.f().readUnquotedString();
            if (!$$4.equals(this.a)) {
                $$0.b().a($$3, this.c, this.b);
                return false;
            }
            return true;
        }

        public String toString() {
            return "terminal[" + this.a + "]";
        }
    }

    public static abstract class a
    implements byo<StringReader> {
        private final byf<CommandSyntaxException> a;
        private final byn<StringReader> b;

        public a(CharList $$0) {
            String $$12 = $$0.intStream().mapToObj(Character::toString).collect(Collectors.joining("|"));
            this.a = byf.a(CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect(), $$12);
            this.b = $$1 -> $$0.intStream().mapToObj(Character::toString);
        }

        @Override
        public boolean a(byk<StringReader> $$0, bym $$1, bye $$2) {
            $$0.f().skipWhitespace();
            int $$3 = $$0.g();
            if (!$$0.f().canRead() || !this.a($$0.f().read())) {
                $$0.b().a($$3, this.b, this.a);
                return false;
            }
            return true;
        }

        protected abstract boolean a(char var1);
    }
}

