/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.GameProfile;
import org.jspecify.annotations.Nullable;

public interface fuq {
    public static final String cS = "*";
    public static final fuq cT = new fuq(){

        @Override
        public String da() {
            return fuq.cS;
        }
    };

    public String da();

    default public @Nullable yh R_() {
        return null;
    }

    default public yh hH() {
        yh $$02 = this.R_();
        if ($$02 != null) {
            return $$02.f().a($$0 -> $$0.a(new yo.e(yh.b(this.da()))));
        }
        return yh.b(this.da());
    }

    public static fuq c(final String $$0) {
        if ($$0.equals(cS)) {
            return cT;
        }
        final yw $$1 = yh.b($$0);
        return new fuq(){

            @Override
            public String da() {
                return $$0;
            }

            @Override
            public yh hH() {
                return $$1;
            }
        };
    }

    public static fuq a(GameProfile $$0) {
        final String $$1 = $$0.name();
        return new fuq(){

            @Override
            public String da() {
                return $$1;
            }
        };
    }
}

