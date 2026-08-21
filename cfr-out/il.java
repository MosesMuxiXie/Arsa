/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType$StringType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;

public class il
implements ib<StringArgumentType, a> {
    @Override
    public void a(a $$0, wx $$1) {
        $$1.a((Enum<?>)$$0.b);
    }

    @Override
    public a a(wx $$0) {
        StringArgumentType.StringType $$1 = $$0.b(StringArgumentType.StringType.class);
        return new a($$1);
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
        $$1.addProperty("type", switch ($$0.b) {
            default -> throw new MatchException(null, null);
            case StringArgumentType.StringType.SINGLE_WORD -> "word";
            case StringArgumentType.StringType.QUOTABLE_PHRASE -> "phrase";
            case StringArgumentType.StringType.GREEDY_PHRASE -> "greedy";
        });
    }

    @Override
    public a a(StringArgumentType $$0) {
        return new a($$0.getType());
    }

    @Override
    public /* synthetic */ ib.a b(wx wx2) {
        return this.a(wx2);
    }

    public final class a
    implements ib.a<StringArgumentType> {
        final StringArgumentType.StringType b;

        public a(StringArgumentType.StringType $$1) {
            this.b = $$1;
        }

        public StringArgumentType a(dz $$0) {
            return switch (this.b) {
                default -> throw new MatchException(null, null);
                case StringArgumentType.StringType.SINGLE_WORD -> StringArgumentType.word();
                case StringArgumentType.StringType.QUOTABLE_PHRASE -> StringArgumentType.string();
                case StringArgumentType.StringType.GREEDY_PHRASE -> StringArgumentType.greedyString();
            };
        }

        @Override
        public ib<StringArgumentType, ?> a() {
            return il.this;
        }

        @Override
        public /* synthetic */ ArgumentType b(dz dz2) {
            return this.a(dz2);
        }
    }
}

