package com.jslee.core.image.cache

import android.content.Context
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory
import com.bumptech.glide.load.engine.cache.LruResourceCache
import com.bumptech.glide.module.AppGlideModule

/**
 * MooBeside
 * @author jaesung
 * @created 2024/02/02
 */
@GlideModule
internal class ImageCacheConfigModule : AppGlideModule() {
    override fun applyOptions(context: Context, builder: GlideBuilder) {
        builder.apply {
            setMemoryCache(LruResourceCache(MEMORY_CACHE_SIZE))
            setDiskCache(InternalCacheDiskCacheFactory(context, DISK_CACHE_NAME, DISK_CACHE_SIZE))
        }
    }

    companion object {
        /**
         * default memory cache size ==> 24mb
         *
         * default disk cache size ==> 250mb
         */
        private const val BYTE_SIZE = 1024L
        const val MEMORY_CACHE_SIZE = 36 * BYTE_SIZE * BYTE_SIZE
        const val DISK_CACHE_NAME = "moobeside_image_disk_cache"
        const val DISK_CACHE_SIZE = 512 * BYTE_SIZE * BYTE_SIZE
    }
}