namespace Fixtures.MirrorSequences
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class SequenceRequestResponseTestExtensions
    {
            /// <summary>
            /// Creates a new pet in the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='pets'>
            /// Pets to add to the store
            /// </param>
            public static IList<Pet> AddPet(this ISequenceRequestResponseTest operations, IList<Pet> pets)
            {
                return Task.Factory.StartNew(s => ((ISequenceRequestResponseTest)s).AddPetAsync(pets), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Creates a new pet in the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='pets'>
            /// Pets to add to the store
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<Pet>> AddPetAsync( this ISequenceRequestResponseTest operations, IList<Pet> pets, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<Pet>> result = await operations.AddPetWithHttpMessagesAsync(pets, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Adds new pet stylesin the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='petStyle'>
            /// Pet style to add to the store
            /// </param>
            public static IList<int?> AddPetStyles(this ISequenceRequestResponseTest operations, IList<int?> petStyle)
            {
                return Task.Factory.StartNew(s => ((ISequenceRequestResponseTest)s).AddPetStylesAsync(petStyle), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Adds new pet stylesin the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='petStyle'>
            /// Pet style to add to the store
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<int?>> AddPetStylesAsync( this ISequenceRequestResponseTest operations, IList<int?> petStyle, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<int?>> result = await operations.AddPetStylesWithHttpMessagesAsync(petStyle, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Updates new pet stylesin the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='petStyle'>
            /// Pet style to add to the store
            /// </param>
            public static IList<int?> UpdatePetStyles(this ISequenceRequestResponseTest operations, IList<int?> petStyle)
            {
                return Task.Factory.StartNew(s => ((ISequenceRequestResponseTest)s).UpdatePetStylesAsync(petStyle), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Updates new pet stylesin the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='petStyle'>
            /// Pet style to add to the store
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<int?>> UpdatePetStylesAsync( this ISequenceRequestResponseTest operations, IList<int?> petStyle, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<int?>> result = await operations.UpdatePetStylesWithHttpMessagesAsync(petStyle, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

    }
}
