package utils;

import java.io.IOException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.microsoft.azure.storage.blob.ContainerURL;
import com.microsoft.azure.storage.blob.ListContainersOptions;
import com.microsoft.azure.storage.blob.PipelineOptions;
import com.microsoft.azure.storage.blob.ServiceURL;
import com.microsoft.azure.storage.blob.SharedKeyCredentials;
import com.microsoft.azure.storage.blob.StorageURL;

public class BlobResponse {

	public static void main(String[] args) throws InvalidKeyException, IOException {
		
		BlobResponse.uploadToBlobStorage();
	}
	
	public static void uploadToBlobStorage() throws InvalidKeyException, IOException {

		
		
		String accountName = "gcdeventhub";
		String accountKey = "347Df7vaqgaDZBSApMY5CsWlNIYCeUmo5CKmpA06okaWABzrX6/lZfLEwwXAH9YsfKLnwG9srqgoHFcnTfDDSQ==";
		//String endpoint = "https://gcdeventhub.blob.core.windows.net/customsinbound";
		String endpoint = String.format(Locale.ROOT, "https://%s.blob.core.windows.net","gcdeventhub");
		String containerName = "customsinbound";
		System.out.println(endpoint);
		
		SharedKeyCredentials creds = new SharedKeyCredentials(accountName, accountKey);
		final int blockLength = 100 * 1024;
		
		System.out.println("starting the connection");
		// Create a ServiceURL to call the Blob service. We will also use this
		// to construct the ContainerURL
		final ServiceURL serviceURL = new ServiceURL(new URL(endpoint),
				StorageURL.createPipeline(creds, new PipelineOptions()));
		
		System.out.println("connected");

		// Create a container using a blocking call to Azure Storage
		// If container exists, we will not create it again
		ContainerURL containerURL = serviceURL.createContainerURL(containerName);
		final List<String> containerList = new ArrayList<>();
		serviceURL.listContainersSegment(null, new ListContainersOptions()).blockingGet().body().containerItems()
				.forEach(container -> {
					String name = container.name();
					
					//containerList.add(name);

				});
		
		serviceURL.listContainersSegment(null, new ListContainersOptions()).subscribe(x->{
			x.body().containerItems().forEach(item->{
				String name = item.name();
				
				containerList.add(name);
			});
		});
		
		if (!containerList.contains(containerName)) {
			containerURL.create(null, null, null);
		}
		
		// local Directory where files are uploaded
//		Path outboundFilePath = Paths.get(SubmissionConstant.OUTBOUND_UPLOAD_LOC);
//		// Walk the directory and filter for .xml files
//		Stream<Path> walk = Files.walk(outboundFilePath).filter(p -> p.toString().endsWith(".xml"));
//        try{
//		Observable.fromIterable(() -> walk.iterator()).flatMap(file -> {
//			log.info("fileName:: " + file.getFileName().toString());
//			BlockBlobURL blobURL = containerURL.createBlockBlobURL(file.getFileName().toString());
//			AsynchronousFileChannel fc = AsynchronousFileChannel
//					.open(Paths.get(outboundFilePath.toString() + File.separator + file.getFileName().toString()));
//			return TransferManager
//					//.uploadFromNonReplayableFlowable(Flux.just(ByteBuffer.wrap(x.getBytes())), blobURL, 1024, 100, null)
//					.uploadFileToBlockBlob(fc, blobURL, blockLength, null)
//					.toObservable()
//					.doOnError(throwable -> {
//						if (throwable instanceof RestException) {
//							log.info("Failed to upload " + outboundFilePath + " with error:"
//									+ ((RestException) throwable).response().statusCode());
//						} else {
//							log.error(throwable.getMessage());
//						}
//					}).doAfterTerminate(() -> {
//						log.info("Upload of " + file + " completed");
//						fc.close();
//					});
//
//		}, 20).subscribe(response -> {
//			log.info("Completed upload request with Status:: {}" + response.response().statusCode());
//		});
//       } finally{
//    	   walk.close();
//       }
	}

}
