/*
 * SmartPlayerJni.java
 * SmartPlayerJni
 * 
 * Github: https://github.com/daniulive/SmarterStreaming
 * 
 * Created by DaniuLive on 2015/09/26.
 * Copyright © 2014~2016 DaniuLive. All rights reserved.
 */

package com.daniulive.smartplayer;

import com.eventhandle.SmartEventCallback;

public class SmartPlayerJni {	
	 /**
	 * Initialize Player.
	 *
	 * @param ctx: get by this.getApplicationContext()
	 *
	 * <pre>This function must be called firstly.</pre>
	 *
	 * @return player handle if successful, if return 0, which means init failed. 
	 */
	 
	 public native long SmartPlayerInit(Object ctx);
	  	
	 /**
	  * Set callback event
	  * 
	  * @param callback function
	  * 
	  * @return {0} if successful
	  */
	 public native int SetSmartPlayerEventCallback(long handle, SmartEventCallback callback);
	 
	 /**
	 * Set Surface view.
	 *
	 * @param handle: return value from SmartPlayerInit()
	 *
	 * @param glSurface: surface view
	 * 
	 * <pre> NOTE: if not set or set glSurface with null, it will playback audio only. </pre> 
	 *
	 * @return {0} if successful
	 */
	 public native int SmartPlayerSetSurface(long handle, Object glSurface);
	

	 /**
	  * Set AudioOutput Type
	  * 
	  * @param handle: return value from SmartPlayerInit()
	  * 
	  * @param use_audiotrack: 
	  * 
	  * <pre> NOTE: if use_audiotrack with 0: it will use auto-select output devices; if with 1: will use audiotrack mode. </pre> 
	  * 
	 * @return {0} if successful
	  */
	 public native int SmartPlayerSetAudioOutputType(long handle, int use_audiotrack);	
	  	  	
	 /**
	 * Set playback orientation.
	 *
	 * @param handle: return value from SmartPlayerInit()
	 * 
	 * @param surOrg: current orientation,  PORTRAIT 1, LANDSCAPE with 2
	 *
	 * @return {0} if successful
	 */
	 public native int SmartPlayerSetOrientation(long handle, int surOrg);
		  	
	 /**
	 * Start playback stream
	 *
	 * @param handle: return value from SmartPlayerInit()
	 * 
	 * @param uri: playback uri
	 *
	 * @return {0} if successful
	 */
	 public native int SmartPlayerStartPlayback(long handle, String uri);
		  	
	 /**
	 * Close player instance.
	 *
	 * @param handle: return value from SmartPlayerInit()
	 * 
	 * <pre> NOTE: it could not use player handle after call this function. </pre> 
	 *
	 * @return {0} if successful
	 */
	 public native int SmartPlayerClose(long handle);
}
