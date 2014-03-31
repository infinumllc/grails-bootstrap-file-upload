/*
modules = {

    'blueimp-templates' {
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'tmpl.js']
    }
	
	'jCrop' {
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.Jcrop.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'jquery.Jcrop.css']
	}

    'blueimp-load-image' {
		dependsOn 'jCrop'

        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'load-image.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'load-image-exif.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'load-image-exif-map.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'load-image-ios.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'load-image-meta.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'load-image-orientation.js']
    }

    'blueimp-canvas-to-blob' {
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'canvas-to-blob.js']
    }

	'bootstrap-image-gallery' {
		dependsOn 'bootstrap', 'blueimp-load-image'

		resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'blueimp-gallery.css']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'blueimp-gallery-indicator.css']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'blueimp-gallery-video.css']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'blueimp-helper.js']

		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'blueimp-gallery.js']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'blueimp-gallery-fullscreen.js']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'blueimp-gallery-indicator.js']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'blueimp-gallery-video.js']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'blueimp-gallery-vimeo.js']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'blueimp-gallery-youtube.js']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.blueimp-gallery.js']
	}

    'bootstrap-file-upload' {
        dependsOn 'jquery-ui', 'blueimp-templates', 'blueimp-canvas-to-blob', 'bootstrap-image-gallery'

        resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'jquery.fileupload.css']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'jquery.fileupload-ui.css']

        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.ui.widget.js'] // included in jquery-ui plugin
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.iframe-transport.js']

		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.migrate.min.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-process.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-image.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-audio.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-video.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-validate.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-ui.js']
        resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-jquery-ui.js']
    }
}
*/
modules = {
	'bootstrap-image-gallery' {
		dependsOn 'bootstrap', 'blueimp-load-image'

		resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'blueimp-gallery.css']
		//resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'bootstrap-image-gallery.css']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'bootstrap-image-gallery.js', disposition: 'defer']
	}

	'blueimp-templates' {
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'tmpl.js', disposition: 'defer']
	}

	'blueimp-load-image' {
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'load-image.js', disposition: 'defer']
	}

	'blueimp-canvas-to-blob' {
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'canvas-to-blob.js', disposition: 'defer']
	}

	'bootstrap-file-upload' {
		dependsOn 'jquery-ui', 'blueimp-templates', 'blueimp-canvas-to-blob', 'bootstrap-image-gallery'

		resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'jquery.fileupload-ui.css']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'css', file: 'jquery.fileupload.css']

		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.ui.widget.js', disposition: 'defer'] // included in jquery-ui plugin
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.iframe-transport.js', disposition: 'defer']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.migrate.min.js', disposition: 'defer']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.iframe-transport.js', disposition: 'defer']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload.js', disposition: 'defer']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-process.js', disposition: 'defer']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-validate.js', disposition: 'defer']
		//resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-ip.js']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-ui.js', disposition: 'defer']
		resource url: [plugin: 'bootstrap-file-upload', dir: 'js', file: 'jquery.fileupload-jquery-ui.js', disposition: 'defer']
	}
}