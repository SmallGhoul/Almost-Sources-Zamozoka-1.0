package net.optifine.features.module.util;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.util.ChatUtils;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Spammer extends Module implements PreMotionListener {
   // $FF: synthetic field
   int Harry;
   // $FF: synthetic field
   private final BooleanSetting Charlie;
   // $FF: synthetic field
   private final BooleanSetting Thomas;
   // $FF: synthetic field
   private final NumberSetting Jacob;
   // $FF: synthetic field
   ArrayList<String> Jack;

   static {
      "".length();
      if (-"   ".length() <= 0) {
         ;
      }
   }

   public void George() {
      if (this.Harry++ >= this.Jacob.Oscar()) {
         List<class_742> players = (List)mc.field_1687.method_18456().stream().filter((n) -> {
            byte var1 = n.method_5820().matches("^[a-zA-Z0-9_-]+");
            "".length();
            return (boolean)("  ".length() < 0 ? "".length() : var1);
         }).filter((n) -> {
            byte var10000;
            if (!Integer.valueOf(mc.field_1724.method_5820().hashCode()).equals(n.method_5820().hashCode())) {
               var10000 = 1;
               "".length();
               if (null != null) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)(-" ".length() < -" ".length() ? "".length() : var1);
         }).collect(Collectors.toList());
         if (players.size() > 0) {
            String message = (String)this.Jack.get(ThreadLocalRandom.current().nextInt(this.Jack.size()));
            String player = ((class_742)players.get(ThreadLocalRandom.current().nextInt(players.size()))).method_5820();
            if (message.contains("%player%")) {
               message = message.replace("%player%", player);
               "".length();
               if ("  ".length() <= -" ".length()) {
                  return;
               }
            } else if (this.Charlie.Jack()) {
               message = String.valueOf((new StringBuilder()).append(player).append(" ").append(message));
            }

            this.Harry = 0;
            class_746 var10000 = mc.field_1724;
            StringBuilder var10001 = new StringBuilder();
            String var10002;
            if (this.Thomas.Jack()) {
               var10002 = "!";
               "".length();
               if ((81 + 121 - 201 + 133 ^ 49 + 1 - -56 + 25) <= 0) {
                  return;
               }
            } else {
               var10002 = String.valueOf((new StringBuilder()).append("/msg ").append(player).append(" "));
            }

            var10000.method_3142(String.valueOf(var10001.append(var10002).append(message)));
         }
      }

      "".length();
      if (-" ".length() <= "   ".length()) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      this.Jack.clear();
      Path is = Global.Thomas.Charlie().resolve("messages.txt");
      File file = is.toFile();
      InputStream stream;
      if (!file.exists()) {
         label68: {
            try {
               stream = this.getClass().getResourceAsStream("/assets/zamorozka/messages.txt");
               FileOutputStream outputStream = new FileOutputStream(Global.Thomas.Charlie().resolve("messages.txt").toFile());
               byte[] buffer = new byte[stream.available()];
               stream.read(buffer);
               "".length();
               outputStream.write(buffer);
               outputStream.flush();
               outputStream.close();
            } catch (Exception var9) {
               var9.printStackTrace();
               break label68;
            }

            "".length();
            if ("  ".length() <= 0) {
               return;
            }
         }
      }

      label64: {
         try {
            stream = Files.newInputStream(Paths.get(String.valueOf(is)));

            try {
               BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

               String line;
               while((line = reader.readLine()) != null) {
                  this.Jack.add(line);
                  "".length();
                  "".length();
                  if (-" ".length() >= (104 ^ 108)) {
                     return;
                  }
               }
            } catch (Throwable var7) {
               if (stream != null) {
                  try {
                     stream.close();
                  } catch (Throwable var6) {
                     var7.addSuppressed(var6);
                     throw var7;
                  }

                  "".length();
                  if ((15 ^ 90 ^ 206 ^ 159) <= " ".length()) {
                     return;
                  }
               }

               throw var7;
            }

            if (stream != null) {
               stream.close();
               "".length();
               if ((104 ^ 109) <= 0) {
                  return;
               }
            }
         } catch (IOException var8) {
            var8.printStackTrace();
            ChatUtils.message("Messages file is invalid!");
            this.Charlie();
            break label64;
         }

         "".length();
         if ("  ".length() == 0) {
            return;
         }
      }

      this.Harry = 0;
      if (this.Jack.isEmpty()) {
         ChatUtils.message("Messages file is empty!");
         this.Charlie();
      }

      "".length();
      if (-" ".length() < "  ".length()) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   public Spammer() {
      super("Spammer", "Spams messages in the chat", Category.Charlie);
      this.Jacob = new NumberSetting("Delay", 60.0D, 1.0D, 200.0D, 1.0D, ValueDisplay.Oliver);
      this.Charlie = new BooleanSetting("Call Out Other Players", true);
      this.Thomas = new BooleanSetting("Global Chat", true);
      this.Jack = new ArrayList();
      this.Harry = 0;
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      "".length();
      if ("".length() > 0) {
         throw null;
      }
   }
}
