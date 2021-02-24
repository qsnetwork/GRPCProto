# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from qsn.entity.request import ValidatorRequests_pb2 as qsn_dot_entity_dot_request_dot_ValidatorRequests__pb2
from qsn.entity.response import ValidatorResponses_pb2 as qsn_dot_entity_dot_response_dot_ValidatorResponses__pb2


class ValidatorRpcStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.getValidator = channel.unary_unary(
                '/org.qsn.protobuf.ValidatorRpc/getValidator',
                request_serializer=qsn_dot_entity_dot_request_dot_ValidatorRequests__pb2.GetValidatorRequest.SerializeToString,
                response_deserializer=qsn_dot_entity_dot_response_dot_ValidatorResponses__pb2.GetValidatorResponse.FromString,
                )
        self.getValidatorsByBlockHash = channel.unary_unary(
                '/org.qsn.protobuf.ValidatorRpc/getValidatorsByBlockHash',
                request_serializer=qsn_dot_entity_dot_request_dot_ValidatorRequests__pb2.GetValidatorsByBlockHashRequest.SerializeToString,
                response_deserializer=qsn_dot_entity_dot_response_dot_ValidatorResponses__pb2.GetValidatorsByBlockHashResponse.FromString,
                )


class ValidatorRpcServicer(object):
    """Missing associated documentation comment in .proto file."""

    def getValidator(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def getValidatorsByBlockHash(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ValidatorRpcServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'getValidator': grpc.unary_unary_rpc_method_handler(
                    servicer.getValidator,
                    request_deserializer=qsn_dot_entity_dot_request_dot_ValidatorRequests__pb2.GetValidatorRequest.FromString,
                    response_serializer=qsn_dot_entity_dot_response_dot_ValidatorResponses__pb2.GetValidatorResponse.SerializeToString,
            ),
            'getValidatorsByBlockHash': grpc.unary_unary_rpc_method_handler(
                    servicer.getValidatorsByBlockHash,
                    request_deserializer=qsn_dot_entity_dot_request_dot_ValidatorRequests__pb2.GetValidatorsByBlockHashRequest.FromString,
                    response_serializer=qsn_dot_entity_dot_response_dot_ValidatorResponses__pb2.GetValidatorsByBlockHashResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'org.qsn.protobuf.ValidatorRpc', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class ValidatorRpc(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def getValidator(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/org.qsn.protobuf.ValidatorRpc/getValidator',
            qsn_dot_entity_dot_request_dot_ValidatorRequests__pb2.GetValidatorRequest.SerializeToString,
            qsn_dot_entity_dot_response_dot_ValidatorResponses__pb2.GetValidatorResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def getValidatorsByBlockHash(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/org.qsn.protobuf.ValidatorRpc/getValidatorsByBlockHash',
            qsn_dot_entity_dot_request_dot_ValidatorRequests__pb2.GetValidatorsByBlockHashRequest.SerializeToString,
            qsn_dot_entity_dot_response_dot_ValidatorResponses__pb2.GetValidatorsByBlockHashResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
