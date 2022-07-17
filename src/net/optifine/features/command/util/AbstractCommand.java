package net.optifine.features.command.util;

import net.optifine.util.ChatUtils;
import net.optifine.util.Feature;
import net.optifine.features.command.exception.CommandException;

import java.util.Objects;

public abstract class AbstractCommand extends Feature {
   // $FF: synthetic field
   private final String Jack;
   // $FF: synthetic field
   private final String[] Harry;
   // $FF: synthetic field
   private final String Oliver;

   public final void Jack() {
      String[] var1 = this.Jack.split("\n");
      int var2 = var1.length;
      int var3 = 0;

      do {
         String line;
         if (var3 >= var2) {
            var1 = this.Harry;
            var2 = var1.length;
            var3 = 0;

            do {
               if (var3 >= var2) {
                  "".length();
                  if (null != null) {
                     return;
                  }

                  return;
               }

               line = var1[var3];
               ChatUtils.message(line);
               ++var3;
               "".length();
            } while(-"  ".length() < 0);

            return;
         }

         line = var1[var3];
         ChatUtils.message(line);
         ++var3;
         "".length();
      } while("".length() <= "".length());

   }

   public String getPrimaryAction() {
      String var1 = "";
      "".length();
      return -" ".length() > 0 ? null : var1;
   }

   public AbstractCommand(String name, String description, String... syntax) {
      this.Oliver = (String)Objects.requireNonNull(name);
      this.Jack = (String)Objects.requireNonNull(description);
      Objects.requireNonNull(syntax);
      "".length();
      if (syntax.length > 0) {
         syntax[0] = String.valueOf((new StringBuilder()).append("Usage: ").append(syntax[0]));
      }

      this.Harry = syntax;
      "".length();
      if (-" ".length() >= 0) {
         throw null;
      }
   }

   public abstract void Oliver(String[] var1) throws CommandException;

   public final String[] Oliver() {
      String[] var1 = this.Harry;
      "".length();
      return "  ".length() == "".length() ? null : var1;
   }

   public final String getDescription() {
      StringBuilder description = new StringBuilder(this.Jack);
      if (this.Harry.length > 0) {
         description.append("\n");
         "".length();
      }

      String[] var2 = this.Harry;
      int var3 = var2.length;
      int var4 = 0;

      do {
         if (var4 >= var3) {
            String var6 = String.valueOf(description);
            "".length();
            if ("".length() != 0) {
               return null;
            }

            return var6;
         }

         String line = var2[var4];
         description.append("\n").append(line);
         "".length();
         ++var4;
         "".length();
      } while(" ".length() > "".length());

      return null;
   }

   public final String getName() {
      String var1 = String.valueOf((new StringBuilder()).append(".").append(this.Oliver));
      "".length();
      return (22 + 82 - 88 + 132 ^ 141 + 52 - 71 + 22) > (143 ^ 195 ^ 40 ^ 96) ? null : var1;
   }

   static {
      "".length();
      if (" ".length() > "".length()) {
         ;
      }
   }
}
