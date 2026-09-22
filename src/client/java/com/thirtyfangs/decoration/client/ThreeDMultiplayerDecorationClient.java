package com.thirtyfangs.decoration.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.network.chat.Component;

import java.util.ArrayDeque;
import java.util.Queue;

import static net.fabricmc.fabric.api.client.command.v2.ClientCommands.literal;

public class ThreeDMultiplayerDecorationClient implements ClientModInitializer {
	private static final String[] COOKIEJAR_COMMAND = {
		"function 3d_multiplayer_decoration:cookie_jar"
	};
	private static final String[] ASIANCHAIR_COMMAND = {
		"function 3d_multiplayer_decoration:asian_chair"
	};
	private static final String[] DRAWER_COMMAND = {
		"function 3d_multiplayer_decoration:drawer"
	};
	private static final String[] SIGN_COMMAND = {
		"function 3d_multiplayer_decoration:sign"
	};
	private static final String[] HYLIANSHIELD_COMMAND = {
		"function 3d_multiplayer_decoration:hylian_shield"
	};
	private static final String[] JAPANESELIGHT_COMMAND = {
		"function 3d_multiplayer_decoration:japanese_light"
	};
	private static final String[] MAJORASMASK_COMMAND = {
		"function 3d_multiplayer_decoration:majorasmask"
	};
	private static final String[] TREEBRANCH_COMMAND = {
		"function 3d_multiplayer_decoration:tree_branch"
	};
	private static final String[] TABLE_COMMAND = {
		"function 3d_multiplayer_decoration:table"
	};
	private static final Queue<String> DISPLAY_QUEUE = new ArrayDeque<>();
	private static int displayTick;
	@Override
	public void onInitializeClient() {
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (!DISPLAY_QUEUE.isEmpty() && client.player != null && displayTick++ % 5 == 0) {
				client.player.connection.sendCommand(DISPLAY_QUEUE.remove());
			}
		});

		ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> dispatcher.register(literal("3dgive")
			.then(literal("cookie_jar")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : COOKIEJAR_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one cookie jar"));

					return 1;
				}))
			.then(literal("asian_chair")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : ASIANCHAIR_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one asian chair"));

					return 1;
				}))
			.then(literal("drawer")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : DRAWER_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one drawer"));

					return 1;
				}))
			.then(literal("sign")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : SIGN_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one sign"));

					return 1;
				}))
			.then(literal("shield")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : HYLIANSHIELD_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one Hylian Shield"));

					return 1;
				}))
			.then(literal("japanese_light")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : JAPANESELIGHT_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one japanese light"));

					return 1;
				}))
			.then(literal("majoras_mask")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : MAJORASMASK_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you Majora's Mask"));

					return 1;
				}))
			.then(literal("tree_branch")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : TREEBRANCH_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you a tree branch"));

					return 1;
				}))	
			.then(literal("table")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : TABLE_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you a table"));

					return 1;
				}))));
	}
}