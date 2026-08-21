/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public class ahy {
    private static final String[] a = new String[]{"Slim", "Far", "River", "Silly", "Fat", "Thin", "Fish", "Bat", "Dark", "Oak", "Sly", "Bush", "Zen", "Bark", "Cry", "Slack", "Soup", "Grim", "Hook", "Dirt", "Mud", "Sad", "Hard", "Crook", "Sneak", "Stink", "Weird", "Fire", "Soot", "Soft", "Rough", "Cling", "Scar"};
    private static final String[] b = new String[]{"Fox", "Tail", "Jaw", "Whisper", "Twig", "Root", "Finder", "Nose", "Brow", "Blade", "Fry", "Seek", "Wart", "Tooth", "Foot", "Leaf", "Stone", "Fall", "Face", "Tongue", "Voice", "Lip", "Mouth", "Snail", "Toe", "Ear", "Hair", "Beard", "Shirt", "Fist"};

    public static String a(cgk $$0) {
        if ($$0 instanceof ddm) {
            return $$0.aq();
        }
        yh $$1 = $$0.as();
        if ($$1 != null) {
            return $$1.getString();
        }
        return ahy.a($$0.cY());
    }

    public static String a(UUID $$0) {
        bgr $$1 = ahy.b($$0);
        return ahy.a($$1, a) + ahy.a($$1, b);
    }

    private static String a(bgr $$0, String[] $$1) {
        return bhs.a($$1, $$0);
    }

    private static bgr b(UUID $$0) {
        return bgr.a($$0.hashCode() >> 2);
    }
}

