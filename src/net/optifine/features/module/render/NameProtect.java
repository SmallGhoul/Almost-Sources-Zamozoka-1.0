package net.optifine.features.module.render;

import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.math.RandomUtil;
import net.minecraft.class_310;
import net.minecraft.class_742;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class NameProtect extends Module implements UpdateListener {
   // $FF: synthetic field
   byte Jack;
   // $FF: synthetic field
   private final NumberSetting Jacob;
   // $FF: synthetic field
   private final EnumSetting< ProtectionType> Harry;
   // $FF: synthetic field
   private static String Charlie = RandomUtil.randomString(16);

   // $FF: synthetic method
   static String Mary() {
      String var0 = Charlie;
      "".length();
      return null != null ? null : var0;
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (" ".length() >= 0) {
         ;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (-" ".length() == -" ".length()) {
         ;
      }
   }

   // $FF: synthetic method
   static class_310 Oscar() {
      class_310 var0 = mc;
      "".length();
      return null != null ? null : var0;
   }

   public String George() {
      String var1 = (( ProtectionType)this.Harry.Harry()).Oliver();
      "".length();
      return (49 ^ 53) < "  ".length() ? null : var1;
   }

   public void Thomas() {
      if (this.Jack != this.Jacob.Oscar()) {
         Charlie = RandomUtil.randomString(this.Jacob.Oscar());
      }

      this.Jack = (byte)this.Jacob.Oscar();
      "".length();
      if ("   ".length() > " ".length()) {
         ;
      }
   }

   public NameProtect() {
      super("NameProtect", "Hides your username", Category.Harry);
      this.Harry = new EnumSetting("Protection Type", ProtectionType.values(), ProtectionType.Jack);
      this.Jacob = new NumberSetting("Length", 2.0D, 1.0D, 21.0D, 1.0D);
      this.Jack = 0;
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      "".length();
      if (-(79 ^ 74) >= 0) {
         throw null;
      }
   }

   // $FF: synthetic method
   static class_310 James() {
      class_310 var0 = mc;
      "".length();
      return "".length() > "   ".length() ? null : var0;
   }

   static {
      "".length();
      if ("   ".length() >= " ".length()) {
         ;
      }
   }

   public String Oliver() {
      String var1 = ProtectionType.Oliver(( ProtectionType)this.Harry.Harry());
      "".length();
      return "   ".length() < " ".length() ? null : var1;
   }

   // $FF: synthetic method
   static class_310 William() {
      class_310 var0 = mc;
      "".length();
      return -" ".length() != -" ".length() ? null : var0;
   }

   private static enum ProtectionType {
      // $FF: synthetic field
      Harry("Random", () -> {
         String var1;
         if (NameProtect.Oscar().field_1687 == null) {
            var1 = Jack.Oliver();
            "".length();
            if ((199 ^ 195) <= 0) {
               return null;
            }
         } else {
            int size = NameProtect.James().field_1687.method_18456().size();
            if (size <= 1) {
               var1 = Jack.Oliver();
               "".length();
               if (" ".length() <= 0) {
                  return null;
               }
            } else {
               var1 = ((class_742)NameProtect.William().field_1687.method_18456().get(size - 1)).method_5477().method_10851();
               "".length();
               if ("   ".length() == 0) {
                  return null;
               }
            }
         }

         return var1;
      });

      // $FF: synthetic field
      private final String Jacob;
      // $FF: synthetic field
      Jack("Gibberish", () -> {
         String var0 = NameProtect.Mary();
         "".length();
         return (186 ^ 191) <= 0 ? null : var0;
      }),
      // $FF: synthetic field
      Oliver("Brand", () -> {
         String var0 = "Zm loves you";
         "".length();
         return "   ".length() == -" ".length() ? null : var0;
      });

      // $FF: synthetic field
      private Type Charlie;

      // $FF: synthetic method
      static String Oliver( ProtectionType x0) {
         String var1 = x0.Jacob;
         "".length();
         return -"  ".length() >= 0 ? null : var1;
      }

      public String Oliver() {
         String var1 = this.Charlie.getValueString();
         "".length();
         return "".length() != 0 ? null : var1;
      }

      static {
         "".length();
         if ((242 ^ 199 ^ 22 ^ 39) > "  ".length()) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Jacob;
         "".length();
         return (112 ^ 116) < (120 ^ 124) ? null : var1;
      }

      private ProtectionType(String name, Type type) {
         this.Jacob = name;
         this.Charlie = type;
         "".length();
         if (null != null) {
            throw null;
         }
      }

      private interface Type {
         static {
            "".length();
            if ("   ".length() == "   ".length()) {
               ;
            }
         }

         String getValueString();
      }
   }
}
